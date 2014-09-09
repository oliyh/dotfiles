{:user {:plugins [[cider/cider-nrepl "0.9.1"]
                  [refactor-nrepl "1.1.0"]
                  [lein-ancient "0.6.7" :exclusions [org.clojure/clojure commons-codec commons-logging]]
                  [lein-cljsbuild "1.0.3"]
                  [jonase/eastwood "0.1.3"]
                  [lein-cloverage "1.0.2"]
                  [lein-try "0.4.3"]]
        :dependencies [[criterium "0.4.3"]
                       [org.clojure/tools.nrepl "0.2.10"]]}}
