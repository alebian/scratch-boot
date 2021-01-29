.PHONY: lint
lint:
	./gradlew pmdMain
	./gradlew pmdTest
	./gradlew checkstyleMain
	./gradlew checkstyleTest

test:
	./gradlew test

clean:
	./gradlew clean

build: clean
	./gradlew build
