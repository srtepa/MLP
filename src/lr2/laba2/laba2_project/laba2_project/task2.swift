import Foundation


func numOfOdd(_ array: [Int]) -> Int {
    array.filter { $0 % 2 != 0 }.count
}

func numOfWords(_ str: String) -> Int {
    str.split(separator: " ").filter { !$0.isEmpty }.count
}
