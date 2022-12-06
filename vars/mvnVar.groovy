import com.mavenSL

def call() {
    def mavenBuild = new mvnBuild(this)
    mavenBuild.build()
}


