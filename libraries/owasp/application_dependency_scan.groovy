void call() {
    stage("OWASP: Dependency Check") {
        dependencyCheck additionalArguments: 'scan="path to scan" --format HTML', odcInstallation: 'Default-Test'

        dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
    }
}
