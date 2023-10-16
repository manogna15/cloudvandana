function SortDescending(arr) {
  let n = arr.length;
  let swapped;

  do {
    swapped = false;
    for (let i = 0; i < n - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        
        const temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        swapped = true;
      }
    }
  } while (swapped);

  return arr;
}

const inputArr = prompt("Enter an array of numbers");
const Arr = input.split(',').map(inputArr);
const sortedArr = SortDescending(Arr);
console.log("Sorted Array (Descending Order):", sortedArr);
