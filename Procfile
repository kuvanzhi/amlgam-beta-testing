migrate: java -jar target/dependency/liquibase.jar --changeLogFile=src/main/resources/db/changelog/db.changelog-master.yaml --url=$JDBC_DATABASE_URL --classpath=target/dependency/postgres.jar update
web: java -Dserver.port=$PORT $JAVA_OPTS -jar target/*.jar
