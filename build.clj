(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:main 'cljs-hello-world.core
   :output-to "out/main.js"})
