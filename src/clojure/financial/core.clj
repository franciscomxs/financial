(ns financial.core
  (:import (javahandler Request Response)))

(gen-class
  :name "financial.core"
  :methods [[handler
            [javahandler.Request com.amazonaws.services.lambda.runtime.Context]
            javahandler.Response]])


(defn pmt [rate, nper, pv]
  (* pv (/
         (* (Math/pow (+ 1 rate) nper) rate)
         (- (Math/pow (+ 1 rate) nper) 1))))

(defn -handler [this request ctx]
  (Response.
    (pmt
      (.getRate request)
      (.getNper request)
      (.getPv request)
    )))
