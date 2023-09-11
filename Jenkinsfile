pipeline {
    agent any

    stages {
        stage('Create Folder on Desktop') {
            steps {
                script {
                    // Specify the path to the external Groovy script
                    def scriptPath = 'createFolder.groovy'

                    // Load the external Groovy script
                    def externalScript = load scriptPath

                    // Define the folder name parameter
                    def folderName = "my_folder_on_desktop"

                    // Execute the 'createFolderOnDesktop' method with the folder name
                    externalScript.createFolderOnDesktop(folderName)

                    // Print a confirmation message
                    echo "Folder created on the desktop at: ${System.getProperty("user.home")}/Desktop/${folderName}"
                }
            }
        }
    }
}