# Кристијан Арсов 153118

![CFGLab2](https://user-images.githubusercontent.com/56222866/169652212-8260d2e3-e791-443d-9329-55195b1a8e65.png)


![20220521_115632](https://user-images.githubusercontent.com/56222866/169652231-c9d10478-07dc-49a6-b5bf-46710b7f2b7d.jpg)

# Цикломатската комплексност ја израчунав според бројот на региони кои ги има Control Flow Graphot, има 6 региони +1 надворешен = 7. Оваа бројка на цикломатска комплексност значи дека кодот има структуриран и добро напишан код, high testability и овозможува помалку трошоци и напор.

[EveryStatementEveryBranch.xlsx](https://github.com/Kiksi/SI_2022_lab2_153118/files/8747635/EveryStatementEveryBranch.xlsx)

# За Every statement методата беа потребни 3 тестови за да се исполни условот, истите тестови потребни за every statement методата беа доволни и за да ги исполни условите и на Every brench методата. Овие 3 тестови ги запишав во Ексел документот, но и ги употребив како unit тестови. Ги проверив 3те тестови од кои 2 тестови враќаат exception. Поради тоа што два враќаа exception, а имам JUnit 4 морав да напишам код "@Test(expected = IllegalArgumentException.class)", поради овој код напишав посебни функции за секој тест поединечно. JUnit рануваше успешно.

![Fax2](https://user-images.githubusercontent.com/56222866/169652580-d7f194ca-8f85-4289-8c26-131860014666.png)
