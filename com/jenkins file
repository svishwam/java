pipeline{

    agent any

    stages{

        stage("build"){

            steps{

                echo 'building the files...'
            }
        }

        stage("push"){

            steps{

                echo 'pushing the files'
                cd /home/ubuntu/java
                sudo git pull

            }
        }
    }
}
