package com.github.shiloh.exercise

data class Temperature(val celsius: Double) {
    /**
     * 华氏温度
     */
    var fahrenheit: Double = celsius * 9 / 5 + 32

    companion object {
        /**
         * 华氏温度转摄氏度
         * @param fahrenheit 华氏温度
         * @return 摄氏度
         * @author shiloh
         * @date 2025/9/10 17:26
         */
        fun fromFahrenheit(fahrenheit: Double): Temperature = Temperature((fahrenheit - 32) * 5 / 9)
    }
}
