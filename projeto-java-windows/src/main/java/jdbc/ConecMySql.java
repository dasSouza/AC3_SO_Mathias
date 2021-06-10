package jdbc;

import com.mycompany.projeto.java.TelaLogin;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import log.GerandoLog;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author mathias.de.carvalho
 */
public class ConecMySql {
       private BasicDataSource bancoMySql;

    public ConecMySql() {

        GerandoLog gravandoLog = new GerandoLog();

        try {
            gravandoLog.gravarLog("conectando com o banco");

        } catch (IOException ex) {

            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.bancoMySql = new BasicDataSource();
        bancoMySql.setDriverClassName("com.mysql.cj.jdbc.Driver");
        bancoMySql.setUrl("jdbc:mysql://0.0.0.0:3306/KeepCodeBD?autoReconnect=true&useSSL=false");
        bancoMySql.setUsername("root");
        bancoMySql.setPassword("urubu100");
    }

    public BasicDataSource getBancoMySql() {
        return bancoMySql;
    }

   
}
