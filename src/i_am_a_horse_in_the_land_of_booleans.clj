(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (boolean x))

(defn abs [x]
  (abs x))

(defn divides? [divisor n]
  (if (= 0 (mod n  divisor))
    true
    false))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 3 n) "fizz"
    (divides? 5 n) "buzz"
    :else                 ""))
    

(defn teen? [age]
  (>= 19 age 13))

(defn not-teen? [age]
  (not (>= 19 age 13)))

(defn generic-doublificate [x]
  (cond
    (number? x) (+ x x)
     (empty? x) nil
    (list? x) (* (count x) (count x))
    (vector? x) (* (count x) (count x))
    :else  true))
    

(defn leap-year? [year]
  (cond
    
    (and (= (mod year 4)0)(= (mod year 100) 0) (= (mod year 400)0)) true
    (and (= (mod year 4) 0) (= (mod year 100)0)) false
    (=(mod year 4)0) true
    :else false)
    )
; '_______'

