# Кристијан Арсов 153118

![CFGLab2](https://user-images.githubusercontent.com/56222866/169652212-8260d2e3-e791-443d-9329-55195b1a8e65.png)


![20220527_105529](https://user-images.githubusercontent.com/56222866/170667948-33d92caa-5831-4d51-b8e5-35f54e358581.jpg)

![CVrednost](https://user-images.githubusercontent.com/56222866/170668032-a6b2cdea-4b56-4425-9517-66f9c663c772.jpg)

# Цикломатската комплексност ја израчунав според бројот на региони кои ги има Control Flow Graphot, има 8 региони +1 надворешен = 9. Оваа бројка на цикломатска комплексност значи дека кодот има структуриран и добро напишан код, high testability и овозможува помалку трошоци и напор.

[EveryStatementEveryBranch.xlsx](https://github.com/Kiksi/SI_2022_lab2_153118/files/8747635/EveryStatementEveryBranch.xlsx)

# За Every statement методата беа потребни 3 тестови за да се исполни условот, истите тестови потребни за every statement методата беа доволни и за да ги исполни условите и на Every brench методата. Овие 3 тестови ги запишав во Ексел документот, но и ги употребив како unit тестови. Ги проверив 3те тестови од кои 2 тестови враќаат exception. Поради тоа што два враќаа exception, а имам JUnit 4 морав да напишам код "@Test(expected = IllegalArgumentException.class)", поради овој код напишав посебни функции за секој тест поединечно. JUnit рануваше успешно.


![Fax2](https://user-images.githubusercontent.com/56222866/169653020-92ae94ab-6b03-479f-a941-a8ea308d6904.png)

