(defproject com.mefesto/wabbitmq "0.1.0-es"
  :description "WabbitMQ: A simple RabbitMQ wrapper for Clojure"
  :url "https://github.com/mefesto/wabbitmq"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [cheshire "2.0.2"]
                 [com.rabbitmq/amqp-client "2.7.1"]]
  :dev-dependencies [[swank-clojure "1.3.3"]])
