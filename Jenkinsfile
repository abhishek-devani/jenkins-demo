pipeline {

    agent any
    environment {
        NEW_VERSION = '1.1.0'
        // "Credentials Buinding" plugin needed
        // SERVER_CREDS = credentials('server-creds')
    }
    
    stages {

        stage("build") {
            steps {
                echo "building the application..."
                echo "building version ${NEW_VERSION}"
            }
        }

        stage("test") {
            when {
                expression {
                    BRANCH_NAME == 'dev'
                }
            }
            steps {
                echo "testing the application..."
            }
        }

        stage("deploy") {
            steps {
                echo "deploying the application..."
                // Wrapper syntax
                // withCredentials([
                //     usernamePassword(credentials: 'server-creds', userVariable: USER, passwordVariable: PWD)
                // ]) {
                //     echo '${USER} : ${PWD}'
                // }
            }
        }

    }

    post{
        always{
            echo "====++++always++++===="
        }
        success{
            echo "====++++only when successful++++===="
        }
        failure{
            echo "====++++only when failed++++===="
        }
    }

}