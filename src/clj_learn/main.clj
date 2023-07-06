(ns clj-learn.main)

(import java.util.Date)

(defn add [a b]
  (+ a b))


;;  (def my-date (java.util.Date.))


(defn -main []
  (println "hello world")
  (println (add 5 6))

  (let [my-date (Date.)]
    (println (.toString my-date))))