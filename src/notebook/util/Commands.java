package notebook.util;

public enum Commands {
//    NONE ("1"),
    READ ("READ - Чтение абонента по Id"),
    READALL ("READALL - Чтение всей книги абонентов"),
    CREATE ("CREATE - Создание нового абонента"),
    UPDATE ("UPDATE - Обновление данных абонента по Id"),
    DELETE ("DELETE - Удаление абонента по Id"),
    LIST ("LIST - Список всех команд"),
    EXIT ("EXIT - Завершение программы");

    private String title;

    Commands(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}