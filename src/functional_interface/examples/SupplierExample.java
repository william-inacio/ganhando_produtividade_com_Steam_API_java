package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Ola, seja bem-vindo(a)!";

        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(10)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
