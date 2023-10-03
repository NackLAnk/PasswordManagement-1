public class PasswordManager {
    private static PasswordManager instance;
    private PasswordGenerationStrategy passwordGenerationStrategy;

    private PasswordManager() {
        passwordGenerationStrategy = new DefaultPassword();
    }

    public static PasswordManager getInstance() {
        if (instance == null) {
            instance = new PasswordManager();
        }
        return instance;
    }

    public void setPasswordGenerationStrategy(PasswordGenerationStrategy strategy) {
        passwordGenerationStrategy = strategy;
    }

    public String generatePassword() {
        return passwordGenerationStrategy.generatePassword();
    }

    public static class SimplePassword implements PasswordGenerationStrategy {
        @Override
        public String generatePassword() {
            return "SimplePassword123";
        }
    }

    public class DefaultPassword implements PasswordGenerationStrategy {
        @Override
        public String generatePassword() {
            return "DefaultPassword123";
        }
    }

    public static class ComplexPassword implements PasswordGenerationStrategy {
        @Override
        public String generatePassword() {
            return "ComplexPassword123";
        }
    }
}
