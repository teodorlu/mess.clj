(ns teod.mess)

(defn christian* "* - kun heltall!" [x n]
  (let [x (bigint x)
        n (bigint n)]
    (reduce + (repeat n x))))

(defn christian** "^ (**) - kun heltall!" [x a]
  (let [x (bigint x)
        a (bigint a)]
    (reduce christian* (repeat (bigint a) x))))

(let [n 700]
  (time
   (christian** n n)))
