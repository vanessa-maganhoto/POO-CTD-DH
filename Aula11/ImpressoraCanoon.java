package Aula11;
import java.time.LocalDate;
public class ImpressoraCanoon extends Impressora{


        public ImpressoraCanoon(String modelo, String tipoConexao, LocalDate dataFabricacao, int folhasDisponiveis,
                                double porcTinta) {
            super(modelo, tipoConexao, dataFabricacao, folhasDisponiveis, porcTinta);
        }

        @Override
        public String imprimir() {
            if (temPapel() && !precisaTinta()){
                setFolhasDisponiveis(getFolhasDisponiveis() - 1);
                setPorcTinta(getPorcTinta() - 0.01);
                return "Imprimindo!!";
            }else if (temPapel() && precisaTinta()){
                return "Você precisa adicionar tinta!";
            }else if (!temPapel() && precisaTinta()){
                return "Você precisa de tinta e não tem papel!";
            }else {
                return "Você não tem papel!";
            }
        }

        @Override
        public boolean precisaTinta() {
            return super.precisaTinta();
        }
    }

