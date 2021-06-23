import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author rsmal
 */
public class Data {

    Calendar calendar;

    public Data(int dia, int mes, int ano) {
        calendar = new GregorianCalendar(ano, mes-1, dia);
    }

    public static Data parse(String data) {


        String[] dataComponentes = data.trim().split("/");
        int dia = Integer.valueOf(dataComponentes[0]);
        int mes = Integer.valueOf(dataComponentes[1]);
        int ano = Integer.valueOf(dataComponentes[2]);

        return new Data(dia, mes, ano);
    }

    public static boolean datasIguais(Data dataNascimento, Data dataNascimento1) {
        return dataNascimento.equals(dataNascimento1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(calendar, data.calendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calendar);
    }

    @Override
    public String toString() {
        return calendar.get(Calendar.DAY_OF_MONTH) + "/" +
                (calendar.get(Calendar.MONTH)+1) + "/" +
                calendar.get(Calendar.YEAR);
    }

}
