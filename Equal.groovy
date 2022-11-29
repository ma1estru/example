class Equal {
    int number

    Equal(int number){
        this.number = number
    }

    int isEqualOrNot(Equal nr){
        int hundreds = (nr % 100) / 10
        int tens = (nr % 1000) / 100
        if (hundreds == tens) {
            int multiplication = hundreds * tens
            return multiplication
        } else {
            int sum = hundreds + tens
            return sum
        }
    }

    @Override
    String toString() {
        return number
    }
}
