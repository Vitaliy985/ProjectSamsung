Описание

Task Tracker – приложение для мониторинга задач, который снабжен двумя таймерами: Pomodoro таймером и секундомером.
Десятки задач, один исполнитель и восьмичасовой рабочий день. Как всё успеть, не сойти с ума и ничего не забыть? Для того, чтобы помочь людям разобраться с данной проблемой я решил разработать приложение для отслеживания задач. Что же такое техника Pomodoro?

Со временем Франческо развил Pomodoro до полноценной системы: отрезки времени работы увеличились до 25 минут. 
Чем хороша данная техника?
1.	Вы работаете над конкретной задачей. Меньше риска отвлечься и попасть в режим многозадачности, потому что вы знаете — через 25 минут будет перерыв.
2.	Вы успеваете сделать больше за меньшее время. Вы не отвлекаетесь на другие задачи и соцсети, а значит не перегружаете мозг лишней информацией.
3.	Вы можете проанализировать, насколько эффективно выполнили задачу. В отличие от простого вычеркивания выполненных задач в блокноте, в конце дня вы видите, сколько времени ушло на каждую задачу. К примеру, одна из задач могла быть слишком большой, и вы потратили на неё весь день. Такую большую задачу лучше разделить на несколько мелких.
4.	Вы видите прямую связь между целью и задачами для её достижения. Цель достигается небольшими шагами (задачами), и вы понимаете, на каком этапе пути находитесь — по количеству зачеркнутых за день задач.
5.	Вы можете настроить технику под свой ритм и потребности. Например, увеличить продолжительность «помидора» или перерыва. Также можно переставить большой перерыв на время обеда, если используете Pomodoro в офисе.
6.	Вы учитесь грамотно планировать задачи на день. При планировании дня с Pomodoro вы выбираете наиболее приоритетные задачи и прогнозируете, сколько времени займет каждая из них.

Функции:
1.	Создание, редактирование и удаление задач
2.	Задача: имя, описание, расчетное время, затраченное время
3.	Индивидуальные цвета для задач
4.	Интерактивный таймер с круговой анимацией
5.	Настройки периодов таймера, длительных перерывов и уведомлений
6.	Уведомления о текущем таймере и о завершении

Структура
Активности:
EditTaskActivity – активность, в которой изменяются настройки таймера
NewTaskActivity – активность, в которой устанавливаются все настройки таймера (время, цвет)
SettingsActivity – для установления настроек
StatisticsActivity – для вывода статистики
TaskListActivity – для вывода всех задач и возможности взаимодействия с ними (при помощи таких классов как AlertDialog, DialogInterface)
TimerActivity – для взаимодействия с таймерами (выбора нужного таймера, отображения уведомлений о таймерах и т. д.) (при помощи класса Chronometer и классов для работы с уведомлениями NotificationChannel, NotificationManager)
Адаптеры:
StatisticCursorAdapter – для связывания и передачи данных в StatisticActivity
TaskListCursorAdapter – для связывания и передачи данных в TaskListActivity

Прочее:
База данных:
TaskTrackerContract – содержит три абстрактных класса (StatisticLogEntry, SubTaskEntry, TaskEntry), описывающие столбцы соответствующих баз данных в SQLite
DBHelper – содержит функции для создания баз данных Statistics, Tasks (при помощи SQLiteOpenHelper)
DataSourse – для работы с базой данных (заполнения, получения, обновления и удаления данных) (при помощи SQLiteOpenHelper, SQLiteDatabase)

Диалоги: 
TimerSelectionDialogFragment – для создания диалогового окна с выбором таймера

Модели:
PomodoroTimer – реализует работу Pomodoro таймера (содержит функции начала работы, паузы, остановки, окончания работы, получения времени и др.)
StatisticLog – содержит функции установления и получения данных
StopWatch – реализует работу секундомера (как и PomodoroTimer содержит функции для начала работы, паузы, остановки, окончания работы, получения времени и самой работы)
SubTask – для создания подзадач (пока что на стадии разработки)
TimerMode – содержит enum из ASK, STOPWATCH, POMODORO
TimerStatus – содержит enum из WORK, BREAK, WAIT_FOR_WORK, WAIT_FOR_BREAK, PAUSED_WORK
Также в приложении есть фрагменты, которые отображаются на экране (для отображения статистики, задачи).
Видео-демонстрация работы проекта https://www.youtube.com/watch?v=q46V3IBVRfM&ab_channel=%D0%92%D0%B8%D1%82%D0%B0%D0%BB%D0%B8%D0%B9%D0%A2%D0%B0%D0%B9%D0%B1%D0%B0%D1%81%D0%B0%D1%80%D0%BE%D0%B2
