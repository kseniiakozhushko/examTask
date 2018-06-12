#Environment installing
=======================
####**Steps**
1. Download last version of IntelliJ IDEA for Windows
2. Download JDK
3. Download Firefox
4. Install Firefox
5. Install JDK (proceed with ‘next’ button)
6. Install IntelliJ IDEA (proceed with ‘next’ button)
7. Download geckodriver and copy to ‘System 32’ folder


#What's inside project
======================
####Pages:
1. GoogleBasePage - general page, which contains methods and objects for all pages
2. GoogleMainPage - main Google page, which contains methods and objects to begin searching
3. SearchResultsPage - page with search results
4. SecondSearchResultsPage - second page with search results

####Tests:
1. SearchBaseTest - general test, which contains methods and objects for all tests. Contains "Before" and "After" methods
2. SeleniumSearchTest - test to search needed results on two results pages ("SearchResultsPage" and "SecondSearchResultsPage")

####Files:
1. search-tests.xml - to run test suites
2. pom.xml - to set needed dependencies
3. .gitignore - files to be ignored by Git