package restaurante;
import java.sql.*;
import java.sql.Connection;
 
public class BancoDados {
Connection con = null;
 
public BancoDados() throws SQLException {
            con = DriverManager.getConnection("jdbc:postgresql://localhost/restaurante", "postgres", "root");
            System.out.println("Consequi fazer a conexao");
            
//Neste construtor, escreva o codigo necessário para
// conexao com o banco de dados do PostgresSQL
}
public void login (String email, String senha) throws SQLException {
while(true){
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM 'CREDENCIAL_CLIENTE' WHERE email="email"");
            String coluna1, coluna2;
while (rs.next()){
    user = rs.getString(1);
    System.out.println(coluna1);
    pass = rs.getString(2);
    System.out.println(coluna2);
}
if(email.equals(user) && senha.equals(pass) ){
    System.out.print("your login message");
    break;
} else{
    System.out.print("Autenticacao Invalida");
    System.out.print("Insira sua senha");
    senha = null
	senha = s.nextLine().trim();
}
}

public void buscaRestaurantes (String CEP) throws SQLException {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("INSERT INTO CLIENTE VALUES
    ('UA502', 'Bananas', 105, '1971-07-13', 'Comedy', '82 minutes');");
            String coluna1, coluna2, coluna3,
while (rs.next()){
    coluna1 = rs.getString(1);
    System.out.println(coluna1);
    coluna2 = rs.getString(2);
    System.out.println(coluna2);
    coluna3 = rs.getString(3);
    System.out.println(coluna3);
}
public void buscaRestaurantes (String nomeCliente, String cpfCliente,String rgCliente, String telefoneCliente, String ruaCliente,String cidadeCliente,String estadoCliente,String cepCliente,String enderecoCliente, String emailCliente,String senha,String regiaoCliente) throws SQLException {
                    Statement st = con.createStatement();
    //st.executeQuery("INSERT INTO UF VALUES ('"estadoCliente"');")
    st.executeQuery("WITH
    UF AS (insert into UF(UF) values ("estadoCliente") returning id),
    CIDADE AS (insert into CIDADE(CIDADE,UF_ID) values ("cidadeCliente",UF_ID) returning id),
    ENDERECO AS (insert into ENDERECO(ENDERECO,CIDADE_ID,CEP,REGIAO) values ("ruaCliente",CIDADE_ID,"cepCliente","regiaoCliente") returning id)
    CREDENCIAL_CLIENTE AS (insert into CREDENCIAL_CLIENTE (SENHA,EMAIL) values ("senhaCliente","emailCliente") returning EMAIL)


    INSERT INTO CLIENTE VALUES
    ("nomeCliente"', '"cpfCliente"', '"rgCliente"', '"telefoneCliente"', EMAIL);");

}


}
© 2019 GitHub, Inc.