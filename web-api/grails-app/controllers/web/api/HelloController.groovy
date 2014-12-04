package web.api

class HelloController {

    def index() {
	    //return [hello: "Hello World!"];
        def hello = 1;
        return [ hello: hello ];
    }
}
