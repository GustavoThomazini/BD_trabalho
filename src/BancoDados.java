package restaurante;
import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;
 
public class BancoDados{
    
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
            ResultSet rs = st.executeQuery("SELECT * FROM 'CREDENCIAL_CLIENTE' WHERE '"+email+"'=email");
            String coluna1;
            String coluna2;
            String user;
            String pass;

while (rs.next()){
    user = rs.getString(1);
    System.out.println(user);
    pass = rs.getString(2);
    System.out.println(pass);
if(email.equals(user) && senha.equals(pass)){
    System.out.print("your login message");
    break;
} else{
    System.out.print("Autenticacao Invalida");
    System.out.print("Insira sua senha");
    Scanner s = new Scanner (System.in);
    senha = null;
	senha = s.nextLine().trim();
}
}
}
}
/*
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
}*/
public void insereDadosCliente(String nome, String cpf,String rg, String telefone, String rua,String cidade,String estado,String cep,String endereco, String email, String senha, String regiao) throws SQLException {
                    Statement st = con.createStatement();
    //st.executeQuery("INSERT INTO UF VALUES ('"estadoCliente"');")
    st.executeQuery("WITH UF AS (insert into UF(UF) values('"+estado+"') returning UF_ID),CIDADE AS(insert into CIDADE(CIDADE,UF_ID) values ('"+cidade+"',UF_ID) returning CIDADE_ID),ENDERECO AS (insert into ENDERECO(ENDERECO,CIDADE_ID,CEP,REGIAO) values ('"+rua+"',CIDADE_ID,'"+cep+"','"+regiao+"') returning id),CREDENCIAL_CLIENTE AS (insert into CREDENCIAL_CLIENTE(SENHA,EMAIL)  values('"+senha+"','"+email+"') returning id)INSERT INTO CLIENTE VALUES('"+nome+"','"+cpf+"','"+rg+"','"+telefone+"',ID_ENDERECO,'"+email +"');");}

}