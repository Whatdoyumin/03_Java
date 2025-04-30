package todo.service;

import todo.command.CommandInvoker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    // Receiver : 실제 작업 수행 객체
    private static TaskManager taskManager = new TaskManager();

    // Invoker : 명령 실행 요청 객체
    private static CommandInvoker commandInvoker = new CommandInvoker();

    // 명령어와 실행 로직을 매핑하는 Map
    private static final Map<Pattern, Consumer<String>> commandHandlers = new HashMap<>();

    // static 초기화 블럭 : 프로그램 실행 시 static 필드 초기회 용도 블럭
    static {
        // 입력된 값이 "exit"와 일치한다면 (^:시작이 동일, $:끝이 동일)
        commandHandlers.put(Pattern.compile("^exit$"), (String input) -> {
            System.out.println("프로그램을 종료합니다.");
            scanner.close();
            System.exit(0);
        });

        commandHandlers.put(Pattern.compile("^todo list$"), (String input) -> {
            taskManager.listTasks();
        });

        commandHandlers.put(Pattern.compile("^todo undo$"), (String input) -> {
            commandInvoker.undoLastCommand();
        });

        commandHandlers.put(Pattern.compile("^todo add .*$"), (String input) -> {
            // 실행 명령어 호출
        });

        commandHandlers.put(Pattern.compile("^todo del .*$"), (String input) -> {
            // 실행 명령어 호출
        });
    }

    public static void main(String[] args) {
        System.out.println();
    }
}