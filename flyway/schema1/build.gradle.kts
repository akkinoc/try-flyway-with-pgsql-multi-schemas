plugins {
    kotlin("jvm") version "1.9.25"
    id("org.flywaydb.flyway") version "10.20.1"
}

buildscript {
    dependencies {
        classpath("org.flywaydb:flyway-database-postgresql:10.20.1")
    }
}

dependencies {
    compileOnly("org.postgresql:postgresql:42.7.5")
}

flyway {
    url = "jdbc:postgresql://localhost:15432/akkinoc-db"
    user = "akkinoc"
    password = "akkinoc-pw"
    defaultSchema = "schema1"
    cleanDisabled = false
}
