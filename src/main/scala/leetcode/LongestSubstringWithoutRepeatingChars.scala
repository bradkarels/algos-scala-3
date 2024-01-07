package leetcode

import scala.annotation.tailrec
import scala.util.control.Breaks.{break, breakable}

/*
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 */
object LongestSubstringWithoutRepeatingChars:
  def lengthOfLongestSubstring(s: String): Int =
    doLengthOfLongestSubstring(s.toCharArray).length

  @tailrec
  private final def doLengthOfLongestSubstring(ca: Array[Char], longestSubString: Array[Char] = Array.emptyCharArray): Array[Char] = 
    if longestSubString.length >= ca.length || ca.isEmpty then longestSubString
    else
      val subString: Array[Char] = buildSubStr(ca)
      if (subString.length > longestSubString.length) doLengthOfLongestSubstring(ca.tail, subString)
      else  doLengthOfLongestSubstring(ca.tail, longestSubString)
  end doLengthOfLongestSubstring
  
      
  @tailrec
  private final def buildSubStr(ca: Array[Char], subString: Array[Char] = Array.emptyCharArray): Array[Char] = 
    if ca.isEmpty then subString
    else 
      val head: Char = ca.head
      val updatedSs = subString :+ head
      if hasDuplicates(updatedSs) then
        buildSubStr(Array.emptyCharArray, subString)
      else
        buildSubStr(ca.tail, updatedSs)
  end buildSubStr

  @tailrec
  private final def hasDuplicates(ca: Array[Char], hasDuplicate: Boolean = false): Boolean =
    if ca.isEmpty || hasDuplicate then hasDuplicate
    else
      val head = ca.head
      val tail = ca.tail
      if tail.contains(head) then
        hasDuplicates(Array.emptyCharArray, true)
      else
        hasDuplicates(tail, hasDuplicate)
  end hasDuplicates
end LongestSubstringWithoutRepeatingChars
