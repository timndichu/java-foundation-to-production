# Sequential vs Parallel Streams
The main difference between Sequential and Parallel Stream is listed below:

- Sequential Streams: Process elements in a sequential manner, one element at a time
- Parallel Streams: Process elements in parallel, utilizing multiple CPU cores.

Java Parallel Streams is a feature of Java 8 and higher, meant for utilizing multiple cores of the processor. 

Normally any Java code has one stream of processing, where it is executed sequentially. Whereas by using parallel streams, we can divide the code into multiple streams that are executed in parallel on separate cores and the final result is the combination of the individual outcomes. 

The order of execution, however, is not under our control.

## Why Parallel Streams?
Parallel Streams improve performance by utilizing multiple cores, but they aren't always the best choice. 

In cases where the task requires a specific order of execution, sequential streams are more reliable, even if it means sacrificing performance. 

The performance gain from parallel streams is significant only for **large-scale** or computationally intensive programs. 
For smaller tasks, the difference may be negligible. Use parallel streams primarily when the sequential stream behaves poorly.

Therefore, it is advisable to use parallel streams in cases where no matter what is the order of execution, the result is unaffected and the state of one element does not affect the other as well as the source of the data also remains unaffected. Parallel streams are best used when the order doesn’t matter, elements don’t depend on each other, and data remains unchanged.