(ns xpone.view
  (:require [hiccup.core :as hc]
            [hiccup.page :as hp]))

(defn home-page []
  (hp/html5
    [:body
     [:center
      [:h1 "Hello from Clojure"]]]))

(defn some-page [nama]
  (hp/html5
    [:body
     [:center
      [:h1 (str "Hello " nama ", from Clojure")]]]))


