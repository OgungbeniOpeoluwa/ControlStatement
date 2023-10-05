package chapter5;

public class AutoPolicyTest  {
    public static void main(String[] args) {
        ModifyStateFault autoPolicy = new ModifyStateFault(11111111, "Toyota Camry", "MJ");
        ModifyStateFault policy2 = new ModifyStateFault(22222222, "Ford Fusion","TT" );
        policy2.setState("MJ");
        autoPolicy.setState("YO");
        System.out.println(autoPolicy.getState());
        System.out.println(policy2.getState());

    }

}
