#!/usr/bin/env groovy

// Jenkinsfile (Declarative Pipeline)

pipeline {
  agent any



  stages {
    stage('Stage') {
      steps{
          script {
            withCredentials([azureServicePrincipal('withplugin')]) {
            
              sh 'az login --service-principal -u $AZURE_CLIENT_ID -p $AZURE_CLIENT_SECRET -t $AZURE_TENANT_ID'
              sh 'az account set -s $AZURE_SUBSCRIPTION_ID'        
          }
         }
      }
    }

  }
}
