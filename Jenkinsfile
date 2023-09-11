pipeline {
    agent any

    stages {
        stage('Create Folder on Desktop') {
            steps {
                script {
                    def scriptPath = "script.groovy"
                    def folderName = "temp"

                    def externalScript = load scriptPath
                    externalScript.createFolderOnDesktop(folderName)

                    echo "Folder created on the desktop at: ${System.getProperty("user.home")}/Desktop/${folderName}"
                }
            }
        }
    }
}