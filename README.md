SETUP
1. Stwórz repozytorium git (np. HttpProtocolSandbox),
2. Stwórz projekt mavenowy w repozytorium,
3. Dodaj klasę Main lub Application,
4. Napisz .gitgnore, który wykluczy folder target oraz pliki 
	IntelliJ'a/Eclipse'a.
5. Wrzuć projekt na GitHuba,

DEVELOPMENT
6. Dodaj do pom.xml dependencies ze slack #general
7. Dodaj pakiet service, w którym będzie klasa odpowiedzialna
	za wysyłanie zapytań i parsowanie ich,
8. Dodaj pakiet view, w którym będą klasy odpowiedzialne
	za wyświetlanie użytkownikowi danych w konsoli
9. Dodaj pakiet controller, w którym będzie zarządca apki
10. Dodaj klasę w pakiecie view, która będzie odpowiedzialna
	za wyświetlanie na ekranie,
11. Dodaj interfejs serwisu w pakiecie service, a w pakiecie
	service.impl jego implementację.
12. Dodaj do interfejsu następujące metody:
	* HealthCheck,
	* FindAllTasksByUser,
13. Stwórz pakiet model oraz pakiet dto. W pakiecie model:
	class Task:
		Long id;
		Long user;
		String value;
		Boolean completed;