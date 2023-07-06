(ns clj-learn.main
  (:require [clojure.spec.alpha :as s])
  #_{:clj-kondo/ignore [:use]}
  (:use [clojure.core]))


(import java.util.Date)

(defn add [a b]
  (+ a b))

;; spec ------------------------------------------------------------------------------

(s/def ::name string?)
(s/def ::age (s/and integer? pos?))
(s/def ::person (s/keys :req-un [::name ::age]))

(s/valid? ::person {:name "Alice", :age 30})       ;; => true
(s/valid? ::person {:name "Bob", :age -5})         ;; => false (age is not positive)
(s/valid? ::person {:name 123, :age 30})           ;; => false (name is not a string)
(s/valid? ::person {:name "Charlie"})              ;; => false (age is missing)

;; spec end ---------------------------------------------------------------------------



(defn -main []
  (println "hello world")
  (println (add 5 6))

  (let [my-date (Date.)]
    (println (.toString my-date))))