import com.mavenSL

def call() {
    def mvnBuild = new mavenSL(this)
    mvnBuild.build()
}


