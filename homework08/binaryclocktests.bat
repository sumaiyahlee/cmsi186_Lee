REM # rm test2results.txt
REM # ============================================================================
REM # filename: circlesolvertests.sh
REM # purpose: provide a unified test sequence for the CirlceSolver Integration Project
REM # @see http://bjohnson.lmu.build/cmsi186web/homework08.html for details
REM # ============================================================================

@echo "running BinaryClockSolver test harness for evaluation....." >> test2results.txt
@echo ========================================================= >> test2results.txt

@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with no args
@echo Running BinaryClockSolver with no args >> test2results.txt
java BinaryClockSolver >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with testing
@echo Running BinaryClockSolver with testing >> test2results.txt
java BinaryClockSolver testing >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 0
@echo Running BinaryClockSolver with 0 >> test2results.txt
java BinaryClockSolver 0 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 00:00:00
@echo Running BinaryClockSolver with 00:00:00 >> test2results.txt
java BinaryClockSolver 00:00:00 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 60:60:60
@echo Running BinaryClockSolver with 60:60:60 >> test2results.txt
java BinaryClockSolver 60:60:60 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 40:40:40
@echo Running BinaryClockSolver with 40:40:40 >> test2results.txt
java BinaryClockSolver 40:40:40 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 24:30:30
@echo Running BinaryClockSolver with 24:30:30 >> test2results.txt
java BinaryClockSolver 24:30:30 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 12:30: 6
@echo Running BinaryClockSolver with 12:30: 6 >> test2results.txt
java BinaryClockSolver 12:30: 6 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 1:6:7
@echo Running BinaryClockSolver with 1:6:7 >> test2results.txt
java BinaryClockSolver 1:6:7 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with -8:20:20
@echo Running BinaryClockSolver with -8:20:20 >> test2results.txt
java BinaryClockSolver -8:20:20 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 07 45 08
@echo Running BinaryClockSolver with 07 45 08 >> test2results.txt
java BinaryClockSolver 07 45 08 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 09:11:20
@echo Running BinaryClockSolver with 09:11:20 >> test2results.txt
java BinaryClockSolver 09:11:20 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 03:26:15
@echo Running BinaryClockSolver with 03:26:15 >> test2results.txt
java BinaryClockSolver 03:26:15 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 045:026:178
@echo Running BinaryClockSolver with 045:026:178 >> test2results.txt
java BinaryClockSolver 045:026:178 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 05:11:24
@echo Running BinaryClockSolver with 05:11:24 >> test2results.txt
java BinaryClockSolver 05:11:24 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 08:12:04
@echo Running BinaryClockSolver with 08:12:04 >> test2results.txt
java BinaryClockSolver 08:12:04 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 11:32:59
@echo Running BinaryClockSolver with 11:32:59 >> test2results.txt
java BinaryClockSolver 11:32:59 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 23:59:59
@echo Running BinaryClockSolver with 23:59:59 >> test2results.txt
java BinaryClockSolver 23:59:59 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with la:di:da
@echo Running BinaryClockSolver with la:di:da >> test2results.txt
java BinaryClockSolver la:di:da >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with circle 01:02:03
@echo Running BinaryClockSolver with circle 01:02:03 >> test2results.txt
java BinaryClockSolver circle 01:02:03 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with :34:26
@echo Running BinaryClockSolver with :34:26 >> test2results.txt
java BinaryClockSolver :34:26 >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 20:30:40:
@echo Running BinaryClockSolver with 20:30:40: >> test2results.txt
java BinaryClockSolver 20:30:40: >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 20:30:40:
@echo Running BinaryClockSolver with 20:30:40: >> test2results.txt
java BinaryClockSolver 20:30:40: >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 06:33:02 
@echo Running BinaryClockSolver with 06:33:02  >> test2results.txt
java BinaryClockSolver 06:33:02  >> test2results.txt
@echo ========================================================= >> test2results.txt
@echo . >> test2results.txt
@echo . >> test2results.txt
@echo Running BinaryClockSolver with 12:70:34
@echo Running BinaryClockSolver with 12:70:34 >> test2results.txt
java BinaryClockSolver 12:70:34 >> test2results.txt