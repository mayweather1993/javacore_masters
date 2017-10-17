package exceptions;

/**
 * Исключительной ситуацией называется проблема, из-за которой нормальное
 * продолжение работы метода или части программы, выполняющихся в данный момент,
 * становится невозможным. Важно отличать исключительную ситуацию от обычных
 * ошибок, когда в текущем контексте достаточно информации для преодления
 * затруднений. В исключительной ситуации обработать исключение в текущем
 * контексте невозможно, потому что вы не располагаете необходимой информацией.
 * Остается единственный выход - покинуть текущий контекст и передать проблему
 * на более высокий уровень. Именно это и происходит при выдаче исключения.
 */

public class TestExceptions {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c;

        //перехват исключения ArithmeticException
        /* Если вы не хотите, чтобы метод завершился из-за ошибки,
		 * разместите опасный кусок кода в специальный блок для перехвата исключения -
		 * так называемый блок try*/

        try {
            //при делении на 0 возникает арифметик експепшн
            c = a / b;
      	/* блок catch - обработчик исключений для всех исключений типа ArithmeticException */
        } catch (ArithmeticException e) {
            // обработка ArithmeticException
            c = Integer.MAX_VALUE;
        }
        System.out.println(c);

		/* TODO
		 * Напишите код, который выбрасывает NullPointerException. Оберните
		 * кусок кода, который кидает исключение в блок try и перехватите это
		 * исключение в блоке catch по аналогии с ArithmeticException
		 */
    }

}