#searching the index value of given array using linear search algorithm
def _linear_search(arr):
  for i in range(len(arr)):
    if arr[i] == target:
      return i 
  return -1

arr = [1,2,3,4,5,6]
target = 5
i = _linear_search(arr) # Assigning value to a variable
if i!= -1:
  print("The index value of {target} is {i}.".format(target = target,i = i))
else:
  print("{target} no found in the array.".format(target=target))



  
