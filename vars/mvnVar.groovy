import com.mvnBuild

def call() {
    def mavenBuild = new mvnBuild(this)
    mavenBuild.build()
}


