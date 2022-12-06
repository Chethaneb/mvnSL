package com

class mvnBuild implements Serializable {

    def script

    mvnBuild(script){
        this.script=script
    }

    def clean(){
        script.echo "Inside Clean Function"
        script.sh "mvn clean install"
    }

    def compile(){
        script.echo "Inside compile Function"
        script.sh "mvn compile"
    }

    def test(){
        script.echo "Inside test Function"
        script.sh "mvn test"
    }
    def Package() {
        script.echo "Inside Package Function"
        script.sh "mvn package"
    }


    def build(){
        script.echo "Inside Build Function"
        clean()
        compile()
        test()
        Package()

    }

}


