@Configuration
public class ATMConfig {
    @Beanpublic DataSource dataSource() {
        return new DataSourceDB();    
    }
    
    @Beanpublic Bank bank(DataSource dataSource) {
        return new Bank("My Bank", dataSource);    
    }
    
    @Beanpublic ATM atm(Bank bank) {
        return new ATM(bank);    
    }
    
    @Beanpublic AtmUI atmUI(ATM atm) {
        return new AtmUI(atm);    
    }    
}