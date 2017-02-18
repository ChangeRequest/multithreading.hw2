Multithreading HW2
==================

#### 1 Thread safe elements holder

Implement interface **ElementsHolder**. 
Your implementation should be thread safe.
Use **ReadWriteLock** to provide possibility use any non modifying methods from many thread simultaneously.
  
#### 2 Task Executor

Implement TaskExecutor interface, class should be used for execution tasks in background.

Every task class should implement Task interface. There should be two different tasks:

* Copy File. Copies specified file to specified folder.
* Search for files. Recursively search for files which in specified directory. Search criteria should be set via list of FileFilter instances.

On task execution may occur exceptions. 
If task failed the tries count for this task should be incremented and that task should be pushed back to the queue. 
If task failed 5 times - task should nщt be added to the queue.

Read javadocs for more information for each class.

Implementation notes:
* You should use **java.util.concurrent.ExecutorService** to execute tasks.
* There should be 4 thread-workers.
* **java.util.concurrent.ExecutorService** should use **PriorityBlockingQueue**.
* Search tasks should have higher priority than copy tasks.

Create Demo class that should: 
* Create instance of TaskExecutor;
* Add 3-4 tasks for coping very very big files and 15-20 tasks for finding files on disk in this queue;
* Wait 1 minute and shutdown TaskExecutor.
