import Foundation

func numOfOdd(_ array: [Int]) {
    var count = 0
    
    for number in array {
        if number % 2 != 0 {
            count += 1
        }
    }
    
    print("Число нечетных чисел в массиве: \(count)")
}

func numOfWords(_ str: String) {
    let words = str.split(separator: " ").filter { !$0.isEmpty }
    let count = words.count
    print("Число слов в строке: \(count)")
}
