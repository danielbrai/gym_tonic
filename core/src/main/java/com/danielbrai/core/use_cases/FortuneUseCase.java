package com.danielbrai.core.use_cases;

import jakarta.inject.Named;

import java.util.Arrays;
import java.util.List;

@Named
public class FortuneUseCase {

    public String execute() {
        List<String> motivationalPhrases = Arrays.asList(
                "Um dia bonito começa com um barril de esperança e um café de otimismo.",
                "Mesmo a jornada mais longa começa com um pequeno passo.",
                "Aquilo que não provoca sua morte te torna mais forte!",
                "É sem medo de errar que se conquistam os maiores acertos!",
                "Sucesso é ir de fracasso a fracasso sem perder o entusiasmo.",
                "Acredite que pode, e então estarás na metade do caminho.",
                "A persistência é o caminho do êxito",
                "Viver é algo raro. A maioria apenas existe.",
                "Quem nunca cometeu um erro nunca tentou algo novo.",
                "Quando se navega sem destino, nenhum vento é favorável.",
                "O maior inimigo da criatividade é o bom senso.",
                "Você se lembra quem você era antes do mundo te dizer quem você deveria ser?",
                "Todos nós podemos errar, mas a perseverança no erro é a verdadeira loucura.",
                "Sorte é o que acontece quando a preparação encontra a oportunidade."
                );
        int index = (int) (Math.random() * (14 - 1)) + 1;
        return motivationalPhrases.get(index);
    }
}
