pipeline {
    agent any

    stages {
        stage('Create Folder on Desktop') {
            steps {
                script {
                    def scriptPath = "script.groovy"
                    def folderName = "temp"

                    load scriptPath
                    createFolderOnDesktop(folderName)

                    echo "Folder created on the desktop at: ${System.getProperty("user.home")}/Desktop/${folderName}"
                }
            }
        }
    }
}