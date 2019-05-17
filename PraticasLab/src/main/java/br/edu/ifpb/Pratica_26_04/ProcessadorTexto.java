package br.edu.ifpb.Pratica_26_04;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ProcessadorTexto {

    static void listarArquivoTextoNIO( String origem, String destino )
    {
        Path pathOrigem = Paths.get( origem );
        Path pathDestino = Paths.get( destino );

        System.out.println( pathOrigem.toAbsolutePath() );

        try
        {
            // Files.readAllLines( pathOrigem, StandardCharsets.UTF_8 );
            // menos portável que o comando abaixo...
            List<String> linhas = Files.readAllLines( pathOrigem, Charset.defaultCharset() );
            List<Cidade> cidades = new ArrayList<>();
            //System.out.println(linhas);
            for(String linha : linhas) {
                String palavra[] = linha.split(", ");
                cidades.add(new Cidade(palavra[0], palavra[1], Integer.parseInt(palavra[2])));
            }

            Comparator<Cidade> comparatorPeloNome = (o1, o2) -> o1.getNome().compareTo(o2.getNome());
            Comparator<Cidade> comparatorPeloCodigo = (o1, o2) -> Integer.compare(o1.getCod_postal(), o2.getCod_postal());

            TreeSet<Cidade> treeSet = new TreeSet<>(comparatorPeloNome);
            treeSet.addAll(cidades);
            treeSet.toString();


//            Files.write( pathDestino,
//                    linhas,
//                    Charset.defaultCharset(),
//                    StandardOpenOption.CREATE, // criar o arquivo, caso não exista
//                    StandardOpenOption.TRUNCATE_EXISTING,
//                    StandardOpenOption.WRITE );
        } catch ( IOException e )
        {
            System.out.println( "Erro: na varredura do arquivo." );
        }
    }

    public static void main( String[] args )
    {
        //ProcessadorTexto.listarArquivoTextoIO( "files/carta.txt", "files/nova_carta.txt" );
        ProcessadorTexto.listarArquivoTextoNIO( "files/cities_duplicatas.txt", "files/copia_cities_duplicatas.txt" );
    }

}
