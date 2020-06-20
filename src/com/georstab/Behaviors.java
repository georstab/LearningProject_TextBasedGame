package com.georstab;

public class Behaviors {

    // Move Types
    public interface MoveBehavior {
        String moveType();
    }

    public static class Walk implements MoveBehavior {

        public String moveType() {
            return "Moving !";
        }
    }


    public static class Fly implements MoveBehavior {
        public String moveType() {
            return "Flying";
        }
    }



    // Attack Types
    public interface AttackBehavior {
        String attackType();
    }

    public static class MeleeAttack implements AttackBehavior {
        public String attackType() {
            return "Attacking from close !";
        }
    }

    public static class RangedAttack implements AttackBehavior {
        public String attackType() {
            return "Attacking from a safe distance !";
        }
    }
    public static class MagicAttack implements AttackBehavior {
        public String attackType() {
            return "Burn !!";
        }
    }

}
