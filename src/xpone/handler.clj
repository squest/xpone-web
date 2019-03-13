(ns xpone.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [clojure.pprint :as pp]
            [xpone.view :as view]))

(defroutes app-routes
  (GET "/" [] (view/home-page))
  (GET "/:nama" [nama] (view/some-page nama))
  (route/not-found "Not Found"))

(def app
  (->> (assoc-in site-defaults [:security :anti-forgery] false)
       (wrap-defaults app-routes)))
